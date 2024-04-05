
<template>
  <div class="box">
    <div class="order-details-wrapper">
      <div class="order-details">
        <OverlapGroup />
        <OverlapWrapper />
      </div>
    </div>
  </div>
</template>

<script>
import OverlapGroup from "./Box/sections/OverlapGroup.vue";
import OverlapWrapper from "./Box/sections/OverlapWrapper.vue";

export default {
  name: "Box",
  components: {
    OverlapGroup,
    OverlapWrapper,
  },
};
</script>


<style>
.box {
  height: 720px;
  width: 1200px;
}

.box .order-details-wrapper {
  height: 720px;
  left: 0;
  position: fixed;
  top: 0;
  width: 1200px;
}

.box .order-details {
  background-color: #fdf3cf47;
  height: 720px;
  overflow: hidden;
  position: relative;
}

</style>