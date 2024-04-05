import { createRouter, createWebHistory } from 'vue-router'
import VolunteerPage from '../views/VolunteerPage.vue'

const routes = [
  {
    path: '/',
    name: 'VolunteerPage',
    component: VolunteerPage
  }
  // 其他路由配置...
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
