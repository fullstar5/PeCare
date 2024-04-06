<template>
  <div class="container">
    <div class="header">
<!--      <img class="i-need-pecare" alt="I need pecare" src="..\public\img\i-need-pecare-service.png" />-->
      <div class="frame" style="padding-right: 100px">
        <button type="button" class="VolunteerCenter">
          <span class="btn__txt">Volunteer Center</span>
        </button>
        <button type="button" class="myAccount">
          <span class="btn__txt">My Account</span>
        </button>
        <button type="button" class="loginButton">
          <span class="btn__txt">Log in</span>
        </button>
      </div>
    </div>
  </div>

  <main>
    <v-card >
      <v-layout>
        <v-navigation-drawer
          location="right"
          expand-on-hover
          floating
          permanent
          rail
        >
          <v-list class="nav-list">
            <v-list-item
              prepend-avatar="https://randomuser.me/api/portraits/women/85.jpg"
              subtitle="example@gmail.com"
              title="Example"
            ></v-list-item>
          </v-list>
          <v-list density="compact" nav>
            <v-list-item prepend-icon="mdi-home" title="Home" value="home" to="/home"></v-list-item>
            <v-list-item prepend-icon="mdi-account" title="My Profile" value="myprofile" to="/userHome"></v-list-item>
            <v-list-item prepend-icon="mdi-star" title="About Us" value="about" to="/about"></v-list-item>
          </v-list>
        </v-navigation-drawer>

        <v-main style="height: 0"></v-main>
      </v-layout>
    </v-card>
    <div style="padding-left: 100px; padding-right: 255px">
        <RouterView />
    </div>
    <strong hidden="hidden">Current route path:{{ $route.fullPath }}</strong>

  </main>
</template>

<script>

export default {
  name: 'App',
  components: {
  }
}
</script>

<style>
.container{
  overflow: auto;
  position: absolute;
  height: 100%;
  width: 100%;
  background-color: #FFFFCC !important; /* 淡黄色背景 */
}

.header {
  height: 10%;
  position: absolute;
  width: 100%;
}

.frame {
  align-items: center;
  display: inline-flex;
  gap: 30px;
  justify-content: center;
  left: 70%;
  position: absolute;
  top: 70%;
}

.VolunteerCenter, .myAccount, .loginButton{
  background-color: white; /* Green */
  border: 2px solid #04AA6D;
  color: black;
  border-radius: 12px;
  padding: 10px 10px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 13px;
  transition-duration: 0.4s;
  box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2), 0 6px 20px 0 rgba(0,0,0,0.19);
}

.VolunteerCenter:hover, .myAccount:hover, .loginButton:hover {
  background-color: #04AA6D; /* Green */
  color: white;
}
.VolunteerCenter:active, .myAccount:active, .loginButton:active {
  background-color: #3e8e41;
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}

</style>
