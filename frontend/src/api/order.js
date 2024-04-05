import request from '@/utils/request'

export function listOrder() {
  return request({
    url: '/order/all',
    method: 'post'
  })
}

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
