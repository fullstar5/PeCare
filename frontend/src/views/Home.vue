<template>
  <h1 >Home Page</h1>
  <div>
    <div class="d-flex flex-row mb-6">
      <v-sheet class="ma-2 pa-2">Flex item 1</v-sheet>
      <v-sheet class="ma-2 pa-2">Flex item 2</v-sheet>
      <v-sheet class="ma-2 pa-2">Flex item 3</v-sheet>
    </div>
  </div>
  <v-btn @click="moreItem">More</v-btn>
  <v-btn @click="lessItem">Less</v-btn>

  <v-card
    class="mx-auto"
    max-width="300"
  >
    <v-list
      :items="items"
      item-title="name"
      item-value="id"
    ></v-list>
  </v-card>

</template>

<script>
export default {
  name: 'Home',
  data: () => ({
    items: [
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
    ],
  }),
  methods: {
    moreItem() {
      this.items = [
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
    lessItem() {
      this.items = [
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

</style>
