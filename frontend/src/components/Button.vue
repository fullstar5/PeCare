
<template>
  <button class="button">
    <div class="text-wrapper">Login</div>
  </button>
</template>

<script>
export default {
  name: "Button",
};
</script>


<style>
.button {
  all: unset;
  background: linear-gradient(
    180deg,
    rgb(255, 248.71, 97.75) 0%,
    rgb(243.19, 210.63, 172.4) 53.12%,
    rgb(237.88, 120.29, 11.75) 100%
  );
  border-radius: 12px;
  box-sizing: border-box;
  height: 55px;
  position: relative;
  width: 400px;
}

.button .text-wrapper {
  color: #ffffff;
  font-family: "Noto Sans", Helvetica;
  font-size: 20px;
  font-weight: 600;
  left: 172px;
  letter-spacing: 0;
  line-height: normal;
  position: absolute;
  top: 13px;
}

</style>
