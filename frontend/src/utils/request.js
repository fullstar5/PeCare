import axios from 'axios'
import {processParams} from '@/utils/param'
import errorCode from '@/utils/errorCode'

axios.defaults.headers['Content-Type'] = 'application/json;charset=utf-8'

const instance = axios.create({
  // server url
  baseURL: process.env["VUE_APP_BASE_API"],
  timeout: 10000
})

// Rest Request
instance.interceptors.request.use(config => {
  // create a url like '?product=shirt&color=blue&newuser&size=m'
  if (config.method === 'get' && config.params) {
    let url = config.url + '?' + processParams(config.params);
    config.params = {};
    config.url = url;
  }

  // TODO repeatSubmit judge: maybe this judge can be placed to where the request is invoked.

  if (config.method === 'post' || config.method === 'put') {
    const requestObj = {
      url: config.url,
      data: typeof config.data === 'object' ? JSON.stringify(config.data) : config.data,
      time: new Date().getTime()
    }
    // TODO repeatSubmit judge: maybe this judge can be placed to where the request is invoked.
  }
  return config;
}, error => {
  console.log(error)
})

// REST Response
instance.interceptors.response.use(res => {
  const code = res.data.code || 200;
  const msg = errorCode[code] || res.data.msg || errorCode['default']
  if (res.request.responseType ===  'blob' || res.request.responseType ===  'arraybuffer') {
    return res.data
  }

  // if (code === 500) {
  //   Message({ message: msg, type: 'error' })
  //   return Promise.reject(new Error(msg))
  // } else if (code === 601) {
  //   Message({ message: msg, type: 'warning' })
  //   return Promise.reject('error')
  // } else if (code !== 200) {
  //   Notification.error({ title: msg })
  //   return Promise.reject('error')
  // } else {
  //   return res.data
  // }

}, error => {
  console.log('err' + error)
})
