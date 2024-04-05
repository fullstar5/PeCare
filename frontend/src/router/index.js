import { createMemoryHistory, createRouter } from 'vue-router'

const routes = [
  {
    path: "/",
    alias: "/Home",
    name: "Home",
    component: () => import("@/views/Home")
  },
  {
    path: "/about",
    name: "about",
    component: () => import("@/views/About")
  },
  {
    path: "/credit",
    name: "credit",
    component: () => import("@/views/Credit")
  },
  {
    path: "/order",
    name: "order",
    component: () => import("@/views/Order")
  },
  {
    path: "/orderCreate",
    name: "orderCreate",
    component: () => import("@/views/orderCreate")
  },
  {
    path: "/orderFinish",
    name: "orderFinish",
    component: () => import("@/views/orderFinish")
  },
  {
    path: "/userHome",
    name: "userhome",
    component: () => import("@/views/user/UserHome")
  },
  {
    path: "/userInfo",
    name: "userinfo",
    component: () => import("@/views/user/UserInfo")
  },
  {
    path: "/login",
    name: "login",
    component: () => import("@/views/login/Login")
  },
  {
    path: "/fogotPswd",
    name: "fogotPswd",
    component: () => import("@/views/login/ForgotPswd")
  },
  {
    path: "/signUp",
    name: "signUp",
    component: () => import("@/views/login/signUp")
  }
]

const router = createRouter({
  history: createMemoryHistory(),
  routes
})

export default router
