<template>
  <header class="header">
    <img class="who-i-can-help" alt="Who i can help" src="/img/who-i-can-help.png" />
    <div class="frame">
      <div class="text-wrapper">Service Center</div>
      <div class="div">My Account</div>
    </div>
    <div class="cart-button">
      <div class="text-wrapper-2">Log in</div>
    </div>
  </header>
</template>

<script>
export default {
  name: "Header",
}
</script>


<style>
 .header {
  background-color: transparent;
  height: 112px;
  left: -168px;
  position: absolute;
  top: -3px;
  width: 1440px;
}

.header .who-i-can-help {
  height: 46px;
  left: 204px;
  position: absolute;
  top: 41px;
  width: 278px;
}

.header .frame {
  align-items: center;
  display: inline-flex;
  gap: 30px;
  justify-content: center;
  left: 939px;
  position: absolute;
  top: 48px;
}

.header .text-wrapper {
  color: #000000;
  font-family: "Inter", Helvetica;
  font-size: 16px;
  font-weight: 400;
  height: 22px;
  letter-spacing: 0;
  line-height: 20.8px;
  margin-top: -1px;
  position: relative;
  text-align: center;
  white-space: nowrap;
  width: 113px;
}

.header .div {
  color: #000000;
  font-family: "Inter", Helvetica;
  font-size: 16px;
  font-weight: 400;
  letter-spacing: 0;
  line-height: 20.8px;
  margin-top: -0.5px;
  position: relative;
  text-align: center;
  white-space: nowrap;
  width: fit-content;
}

.header .cart-button {
  background-color: #ffd74c;
  border-radius: 8px;
  height: 48px;
  left: 1218px;
  overflow: hidden;
  position: absolute;
  top: 32px;
  width: 126px;
}

.header .text-wrapper-2 {
  color: #6d6d6d;
  font-family: "Inter", Helvetica;
  font-size: 16px;
  font-weight: 700;
  height: 21px;
  left: 39px;
  letter-spacing: 0;
  line-height: 20.8px;
  position: absolute;
  text-align: center;
  top: 12px;
  white-space: nowrap;
}

</style>
