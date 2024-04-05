<template>
  <h1 >Home Page</h1>
  <div>
    <div class="d-flex flex-row mb-6">
      <v-sheet class="ma-2 pa-2">Flex item 1</v-sheet>
      <v-sheet class="ma-2 pa-2">Flex item 2</v-sheet>
      <v-sheet class="ma-2 pa-2">Flex item 3</v-sheet>
    </div>
  </div>
  <v-btn @click="moreOrder">More</v-btn>
  <v-btn @click="lessOrder">Less</v-btn>

  <div>
    <v-list lines="two" max-width="2400">
      <v-list-item
        v-for="m in Math.floor(total/2)"
        :key="m"
      >
        <v-container class="mb-6" style="height: 180px" >
          <v-row align="start" style="height: 145px">
            <v-col v-for="n in 2" :key="n">
              <v-sheet class="pa-2 ma-2 pecare-order" style="height: 150px">
                {{ (m-1) * 2 + n }}
                <b>Owner: </b>{{ orders[(m-1) * 2 + n]}}<br/>
                <b>Pet Name: </b><br/>
                <b>Time Requirement: </b><br/>
                <b>Location: </b><br/>
              </v-sheet>
            </v-col>
          </v-row>
        </v-container>
      </v-list-item>
    </v-list>

  </div>


</template>

<script>

export default {
  name: 'Home',
  data () {
    return {
      // queryParams is used to search item
      queryParams: {
        ordername: undefined,
        requesterpetid: undefined
      },
      total: 7,
      // form is used to create/update item
      form: {},
      orders: [],
    }
  },
  methods: {
    getAvailableOrder() {

    },
    moreOrder() {
      this.orders = [
        {
          name: 'Item #1',
          id: 1,
        },
        {
          name: 'Item #2',
          id: 2,
        },
        {
          name: 'Item #3',
          id: 3,
        },
        {
          name: 'Item #1',
          id: 1,
        },
        {
          name: 'Item #2',
          id: 2,
        },
        {
          name: 'Item #3',
          id: 3,
        },
      ]
    },
    lessOrder() {
      this.orders = [
        {
          name: 'Item #1',
          id: 1,
        },
      ]
    }
  }
}
</script>

<style scoped>
  @import "../assets/styles/pecare-element.css";
</style>
