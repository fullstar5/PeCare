
<template>
  <div>

  </div>
</template>

<script>
import Header from "./VolunteerPage/sections/Header.vue";
import Overlap from "./VolunteerPage/sections/Overlap/Overlap.vue";
import OverlapGroup from "./VolunteerPage/sections/OverlapGroup.vue";

export default {
  name: "VolunteerPage",
  components: {
    Header,
    Overlap,
    OverlapGroup,
  },
};
</script>


<style>
.volunteer-page {
  background-color: #fdf3cf47;
  display: flex;
  flex-direction: row;
  justify-content: center;
  width: 100%;
}

.volunteer-page .div-4 {
  background-color: #fdf3cf47;
  height: 720px;
  overflow: hidden;
  position: relative;
  width: 1200px;
}

</style>
