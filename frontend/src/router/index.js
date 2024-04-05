import { createRouter, createWebHistory } from 'vue-router'
import VolunteerPage from '../views/VolunteerPage.vue'

const routes = [
  {
    path: '/',
    name: 'VolunteerPage',
    component: VolunteerPage
  },
  // 其他路由配置...
]

const router = new Router({
  // mode: 'history', // require service support
  scrollBehavior: () => ({ y: 0 }),
  routes: constantRoutes
});

export default router
