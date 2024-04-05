import request from '@/utils/request'

/*export function listOrder(query) {
  return request({
    url: '/',
    params: query
  })
}*/

export function createOrder(data) {
    return request({
        url: '/order/create',
        method: 'post',
        params: data
    })
}

export function updateOrder(data) {
    return request({
        url: '/order/update',
        method: 'post',
        data: data
    })
}
