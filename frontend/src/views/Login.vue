
<template>
  <div class="box">
    <div class="login">
      <div class="overlap">
        <div class="login-page">
          <div class="overlap-group">
            <div class="div">
              <img class="mask-group" alt="Mask group" src="/img/mask-group.png" />
              <img class="img" alt="Mask group" src="/img/mask-group-1.png" />
              <img class="mask-group-2" alt="Mask group" src="/img/mask-group-2.png" />
              <div class="frame">
                <div class="frame-2">
                  <div class="frame-3">
                    <div class="upper-section">
                      <div class="login-text">
                        <div class="text-wrapper-2">Login</div>
                        <div class="text-wrapper-3">Glad you’re back.!</div>
                      </div>
                      <div class="credentials">
                        <div class="username">
                          <div class="text-wrapper-4">Username</div>
                        </div>
                        <div class="password-rem">
                          <div class="password">
                            <div class="text-wrapper-4">Password</div>
                            <img class="img-2" alt="Closed eye" src="/img/closed-eye.svg" />
                          </div>
                          <div class="remember">
                            <img
                              class="img-2"
                              alt="Fluent checkbox"
                              src="/img/fluent-checkbox-checked-16-filled.svg"
                            />
                            <div class="text-wrapper-5">Remember me</div>
                          </div>
                        </div>
                        <div class="login-bt-fp">
                          <Button />
                          <div class="text-wrapper-3">Forgot password ?</div>
                        </div>
                      </div>
                    </div>
                    <div class="other-logins">
                      <div class="or">
                        <img class="line" alt="Line" src="/img/line-2.svg" />
                        <div class="text-wrapper-6">Or</div>
                        <img class="line" alt="Line" src="/img/line-2.svg" />
                      </div>
                      <img class="frame-4" alt="Frame" src="/img/frame-3.svg" />
                    </div>
                  </div>
                  <div class="frame-5">
                    <p class="text-wrapper-5">Don’t have an account ? Signup</p>
                    <div class="customer-care">
                      <div class="div-wrapper">
                        <div class="text-wrapper-7">Terms &amp; Conditions</div>
                      </div>
                      <div class="div-wrapper">
                        <div class="text-wrapper-7">Support</div>
                      </div>
                      <div class="div-wrapper">
                        <div class="text-wrapper-7">Customer Care</div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div class="overlap-2">
              <img class="logo" alt="Logo" src="/img/logo-2.png" />
              <img class="logo" alt="Logo" src="/img/logo-2.png" />
            </div>
          </div>
        </div>
        <img class="img-3" alt="Img" src="/img/71b4a3984463bee3489c2ec5f160b95a-1.png" />
      </div>
    </div>
  </div>
</template>

<script>
import Button from "../components/Button.vue";

export default {
  name: "Box",
  components: {
    Button,
  },
};
</script>


<style>
.box {
  height: 917px;
  width: 1457px;
}

.box .login {
  height: 917px;
  left: 0;
  position: fixed;
  top: 0;
  width: 1457px;
}

.box .overlap {
  height: 917px;
  position: relative;
}

.box .login-page {
  background: radial-gradient(50% 50% at 50% 50%, rgb(249.49, 240.32, 216.76) 0%, rgb(255, 249.21, 110.33) 100%);
  height: 917px;
  left: 0;
  position: absolute;
  top: 0;
  width: 1457px;
}

.box .overlap-group {
  height: 773px;
  left: 18px;
  position: relative;
  top: 64px;
  width: 1420px;
}

.box .div {
  height: 773px;
  left: 0;
  position: absolute;
  top: 0;
  width: 1420px;
}

.box .mask-group {
  height: 445px;
  left: 927px;
  position: absolute;
  top: 214px;
  width: 493px;
}

.box .img {
  height: 379px;
  left: 108px;
  position: absolute;
  top: 377px;
  width: 386px;
}

.box .mask-group-2 {
  height: 449px;
  left: 0;
  position: absolute;
  top: 104px;
  width: 466px;
}

.box .frame {
  -webkit-backdrop-filter: blur(53px) brightness(100%);
  backdrop-filter: blur(53px) brightness(100%);
  background: linear-gradient(180deg, rgba(191.25, 191.25, 191.25, 0.06) 0%, rgba(0, 0, 0, 0) 100%);
  border: 1px solid;
  border-color: transparent;
  border-image: linear-gradient(to bottom, rgb(255, 255, 255), rgba(0, 0, 0, 0)) 1;
  border-radius: 20px;
  box-shadow: -8px 4px 5px #0000003d;
  height: 773px;
  left: 470px;
  overflow: hidden;
  position: absolute;
  top: 0;
  width: 482px;
}

.box .frame-2 {
  align-items: center;
  display: inline-flex;
  flex-direction: column;
  gap: 101px;
  left: 40px;
  position: relative;
  top: 97px;
}

.box .frame-3 {
  align-items: flex-start;
  display: inline-flex;
  flex: 0 0 auto;
  flex-direction: column;
  gap: 47px;
  position: relative;
}

.box .upper-section {
  align-items: flex-start;
  display: inline-flex;
  flex: 0 0 auto;
  flex-direction: column;
  gap: 14px;
  position: relative;
}

.box .login-text {
  align-items: flex-start;
  display: inline-flex;
  flex: 0 0 auto;
  flex-direction: column;
  position: relative;
}

.box .text-wrapper-2 {
  color: #ffffff;
  font-family: "Noto Sans", Helvetica;
  font-size: 36px;
  font-weight: 600;
  letter-spacing: 0;
  line-height: normal;
  margin-top: -1px;
  position: relative;
  width: fit-content;
}

.box .text-wrapper-3 {
  color: #ffffff;
  font-family: "Noto Sans", Helvetica;
  font-size: 16px;
  font-weight: 500;
  letter-spacing: 0;
  line-height: normal;
  position: relative;
  width: fit-content;
}

.box .credentials {
  align-items: flex-start;
  display: inline-flex;
  flex: 0 0 auto;
  flex-direction: column;
  gap: 25px;
  position: relative;
}

.box .username {
  align-items: center;
  border: 1px solid;
  border-color: #ffffff;
  border-radius: 12px;
  display: flex;
  flex: 0 0 auto;
  gap: 10px;
  padding: 14px 16px;
  position: relative;
  width: 400px;
}

.box .text-wrapper-4 {
  color: #ffffff;
  font-family: "Noto Sans", Helvetica;
  font-size: 20px;
  font-weight: 400;
  letter-spacing: 0;
  line-height: normal;
  margin-top: -1px;
  position: relative;
  width: fit-content;
}

.box .password-rem {
  align-items: flex-start;
  display: inline-flex;
  flex: 0 0 auto;
  flex-direction: column;
  gap: 12px;
  position: relative;
}

.box .password {
  align-items: center;
  border: 1px solid;
  border-color: #ffffff;
  border-radius: 12px;
  display: flex;
  flex: 0 0 auto;
  justify-content: space-between;
  padding: 14px 16px;
  position: relative;
  width: 400px;
}

.box .img-2 {
  height: 18px;
  position: relative;
  width: 18px;
}

.box .remember {
  align-items: center;
  display: inline-flex;
  flex: 0 0 auto;
  gap: 4px;
  position: relative;
}

.box .text-wrapper-5 {
  color: #ffffff;
  font-family: "Noto Sans", Helvetica;
  font-size: 16px;
  font-weight: 500;
  letter-spacing: 0;
  line-height: normal;
  margin-top: -1px;
  position: relative;
  width: fit-content;
}

.box .login-bt-fp {
  align-items: center;
  display: inline-flex;
  flex: 0 0 auto;
  flex-direction: column;
  gap: 12px;
  justify-content: center;
  position: relative;
}

.box .other-logins {
  align-items: center;
  display: inline-flex;
  flex: 0 0 auto;
  flex-direction: column;
  gap: 12px;
  position: relative;
}

.box .or {
  align-items: center;
  display: inline-flex;
  flex: 0 0 auto;
  gap: 20px;
  position: relative;
}

.box .line {
  height: 2px;
  position: relative;
  width: 170px;
}

.box .text-wrapper-6 {
  color: #4c4c4c;
  font-family: "Noto Sans", Helvetica;
  font-size: 16px;
  font-weight: 500;
  letter-spacing: 0;
  line-height: normal;
  margin-top: -1px;
  position: relative;
  width: fit-content;
}

.box .frame-4 {
  flex: 0 0 auto;
  position: relative;
}

.box .frame-5 {
  align-items: center;
  display: inline-flex;
  flex: 0 0 auto;
  flex-direction: column;
  gap: 8px;
  position: relative;
}

.box .customer-care {
  align-items: center;
  background: linear-gradient(180deg, rgba(97.75, 97.75, 97.75, 0) 0%, rgba(97.75, 97.75, 97.75, 0.07) 100%);
  border-radius: 6px;
  display: flex;
  flex: 0 0 auto;
  justify-content: space-between;
  padding: 4px 6px;
  position: relative;
  width: 400px;
}

.box .div-wrapper {
  align-items: flex-start;
  display: inline-flex;
  flex: 0 0 auto;
  gap: 10px;
  position: relative;
}

.box .text-wrapper-7 {
  color: #ffffff;
  font-family: "Noto Sans", Helvetica;
  font-size: 16px;
  font-weight: 400;
  letter-spacing: 0;
  line-height: normal;
  margin-top: -1px;
  position: relative;
  width: fit-content;
}

.box .overlap-2 {
  background-image: url(../../static/img/logo-2.png);
  background-size: 100% 100%;
  height: 126px;
  left: 1237px;
  position: absolute;
  top: 11px;
  width: 134px;
}

.box .logo {
  height: 126px;
  left: 0;
  position: absolute;
  top: 0;
  width: 134px;
}

.box .img-3 {
  height: 226px;
  left: 96px;
  position: absolute;
  top: 65px;
  width: 182px;
}

</style>