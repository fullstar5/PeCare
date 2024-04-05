<template>

  <v-card >
    <v-layout>
      <v-navigation-drawer
        expand-on-hover
        rail
      >
        <v-list class="nav-list">
          <v-list-item
            prepend-avatar="https://randomuser.me/api/portraits/women/85.jpg"
            subtitle="example@gmail.com"
            title="Example"
          ></v-list-item>
        </v-list>

        <v-divider></v-divider>

        <v-list density="compact" nav>
          <v-list-item prepend-icon="mdi-home" title="Home" value="home" to="/home"></v-list-item>
          <v-list-item prepend-icon="mdi-account" title="My Profile" value="myprofile" to="/userHome"></v-list-item>
          <v-list-item prepend-icon="mdi-star" title="About Us" value="about" to="/about"></v-list-item>
        </v-list>
      </v-navigation-drawer>

      <v-main style="height: 250px"></v-main>
    </v-layout>
  </v-card>

  <p>
    <strong>Current route path:</strong> {{ $route.fullPath }}
  </p>


  <main>
    <RouterView />
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
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
