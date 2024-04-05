import request from '@/utils/request'

export function listOrder(query) {
  return request({
    url: '/',
    params: query
  })
}
