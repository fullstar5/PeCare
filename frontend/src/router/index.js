import { createMemoryHistory, createRouter } from 'vue-router'

const routes = [
  {
    path: "/",
    alias: "/home",
    name: "Home",
    component: () => import("@/views/Home"),
    meta: {
      title: 'Home'
    }
  },
  {
    path: "/about",
    name: "about",
    component: () => import("@/views/About"),
    meta: {
      title: 'About Us'
    }
  },
  {
    path: "/credit",
    name: "credit",
    component: () => import("@/views/Credit"),
    meta: {
      title: 'Credits'
    }
  },
  {
    path: "/order",
    name: "order",
    component: () => import("@/views/Order"),
    meta: {
      title: 'Orders'
    }
  },
  {
    path: "/orderCreate",
    name: "orderCreate",
    component: () => import("@/views/OrderCreate"),
    meta: {
      title: 'Create Order'
    }
  },
  {
    path: "/orderFinish",
    name: "orderFinish",
    component: () => import("@/views/OrderFinish"),
    meta: {
      title: 'Order Finished!'
    }
  },
  {
    path: "/userHome",
    name: "userhome",
    component: () => import("@/views/user/UserHome"),
    meta: {
      title: 'My Profile'
    }
  },
  {
    path: "/userInfo",
    name: "userinfo",
    component: () => import("@/views/user/UserInfo"),
    meta: {
      title: 'Change User Profile'
    }
  },
  {
    path: "/login",
    name: "login",
    component: () => import("@/views/login/Login"),
    meta: {
      title: 'Login'
    }
  },
  {
    path: "/fogotPswd",
    name: "fogotPswd",
    component: () => import("@/views/login/ForgotPswd"),
    meta: {
      title: 'Reset Password'
    }
  },
  {
    path: "/signUp",
    name: "signUp",
    component: () => import("@/views/login/SignUp"),
    meta: {
      title: 'Sign Up'
    }
  }
]

const router = createRouter({
  history: createMemoryHistory(process.env.BASE_URL),
  routes
})

router.beforeEach((to, from, next) => {
  const title = to.meta.title
  if (title) {
    document.title = title
  }
  next()
})

router.afterEach((to, from, next) => {

})


export default router
