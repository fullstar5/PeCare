<template>
    <div class="box">
        <div class="signup">
            <div class="overlap">
                <div class="overlap-wrapper">
                    <div class="overlap-group">
                        <div class="div">
                            <img class="group" alt="Group" src="/img/group.png" />
                            <img class="img" alt="Group" src="/img/group-1.png" />
                            <img class="mask-group" alt="Mask group" src="/img/mask-group.png" />
                            <img class="mask-group-2" alt="Mask group" src="/img/mask-group-1.png" />
                            <img class="mask-group-3" alt="Mask group" src="/img/mask-group-2.png" />
                            <div class="frame">
                                <div class="frame-2">
                                    <div class="frame-3">
                                        <div class="upper-section">
                                            <div class="login-text">
                                                <div class="text-wrapper">Signup</div>
                                                <p class="p">Just some details to get you in.!</p>
                                            </div>
                                            <div class="credentials">
                                                <div class="div-wrapper">
                                                    <div class="text-wrapper-2">Username</div>
                                                </div>
                                                <div class="div-wrapper">
                                                    <div class="text-wrapper-2">Email / Phone</div>
                                                </div>
                                                <div class="password-rem">
                                                    <div class="div-wrapper">
                                                        <label class="text-wrapper-2" for="input-1">
                                                            Password
                                                        </label>
                                                    </div>
                                                    <input class="password" id="input-1" placeholder="Confirm Password"
                                                        type="password" />
                                                </div>
                                                <div class="login-bt-fp">
                                                    <div class="login">
                                                        <div class="text-wrapper-3">Signup</div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="other-logins">
                                            <div class="or">
                                                <img class="line" alt="Line" src="/img/line-2.svg" />
                                                <div class="text-wrapper-4">Or</div>
                                                <img class="line" alt="Line" src="/img/line-2.svg" />
                                            </div>
                                            <img class="frame-4" alt="Frame" src="/img/frame-3.svg" />
                                        </div>
                                    </div>
                                    <div class="frame-5">
                                        <div class="text-wrapper-5">Already Registered? Login</div>
                                        <div class="customer-care">
                                            <div class="frame-6">
                                                <div class="text-wrapper-6">Terms &amp; Conditions</div>
                                            </div>
                                            <div class="frame-6">
                                                <div class="text-wrapper-6">Support</div>
                                            </div>
                                            <div class="frame-6">
                                                <div class="text-wrapper-6">Customer Care</div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="logo-wrapper">
                            <img class="logo" alt="Logo" src="/img/logo-1.png" />
                        </div>
                    </div>
                </div>
                <img class="img-2" alt="Img" src="/img/71b4a3984463bee3489c2ec5f160b95a-2.png" />
            </div>
        </div>
    </div>
</template>

<script>
export default {
    name: "Box",
};
</script>


<style>
.box {
    height: 820px;
    width: 1457px;
}

.box .signup {
    height: 820px;
    left: 0;
    position: fixed;
    top: 0;
    width: 1457px;
}

.box .overlap {
    height: 820px;
    position: relative;
}

.box .overlap-wrapper {
    background: radial-gradient(50% 50% at 50% 50%, rgb(249.49, 240.32, 216.76) 0%, rgb(255, 249.21, 110.33) 100%);
    height: 820px;
    left: 0;
    position: absolute;
    top: 0;
    width: 1457px;
}

.box .overlap-group {
    height: 807px;
    position: relative;
    top: 13px;
}

.box .div {
    height: 807px;
    left: 0;
    position: absolute;
    top: 0;
    width: 1457px;
}

.box .group {
    height: 305px;
    left: 0;
    mix-blend-mode: luminosity;
    position: absolute;
    top: 502px;
    width: 312px;
}

.box .img {
    height: 414px;
    left: 1059px;
    mix-blend-mode: luminosity;
    position: absolute;
    top: 393px;
    width: 398px;
}

.box .mask-group {
    height: 411px;
    left: 945px;
    position: absolute;
    top: 396px;
    width: 493px;
}

.box .mask-group-2 {
    height: 314px;
    left: 110px;
    position: absolute;
    top: 493px;
    width: 386px;
}

.box .mask-group-3 {
    height: 583px;
    left: 0;
    position: absolute;
    top: 147px;
    width: 500px;
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
    height: 798px;
    left: 488px;
    overflow: hidden;
    position: absolute;
    top: 0;
    width: 482px;
}

.box .frame-2 {
    align-items: center;
    display: inline-flex;
    flex-direction: column;
    gap: 53px;
    left: 40px;
    position: relative;
    top: 97px;
}

.box .frame-3 {
    align-items: flex-start;
    display: inline-flex;
    flex: 0 0 auto;
    flex-direction: column;
    gap: 16px;
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

.box .text-wrapper {
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

.box .p {
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

.box .div-wrapper {
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

.box .text-wrapper-2 {
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
    background: none;
    border: 1px solid;
    border-color: #ffffff;
    border-radius: 12px;
    color: #ffffff;
    font-family: "Noto Sans", Helvetica;
    font-size: 20px;
    font-weight: 400;
    letter-spacing: 0;
    line-height: normal;
    margin-top: -1px;
    padding: 14px 16px;
    position: relative;
    width: 400px;
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

.box .login {
    align-items: center;
    background: linear-gradient(180deg,
            rgb(222.61, 238, 45.62) 0%,
            rgb(191.25, 59.26, 30.28) 53.12%,
            rgb(204.28, 137.47, 7.78) 100%);
    border-radius: 12px;
    display: flex;
    flex: 0 0 auto;
    gap: 10px;
    justify-content: center;
    padding: 14px 10px;
    position: relative;
    width: 400px;
}

.box .text-wrapper-3 {
    color: #ffffff;
    font-family: "Noto Sans", Helvetica;
    font-size: 20px;
    font-weight: 600;
    letter-spacing: 0;
    line-height: normal;
    margin-top: -1px;
    position: relative;
    width: fit-content;
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

.box .text-wrapper-4 {
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

.box .frame-6 {
    align-items: flex-start;
    display: inline-flex;
    flex: 0 0 auto;
    gap: 10px;
    position: relative;
}

.box .text-wrapper-6 {
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

.box .logo-wrapper {
    background-image: url(../../static/img/logo-1.png);
    background-size: 100% 100%;
    height: 126px;
    left: 1255px;
    position: absolute;
    top: 62px;
    width: 134px;
}

.box .logo {
    height: 126px;
    left: 0;
    position: absolute;
    top: 0;
    width: 134px;
}

.box .img-2 {
    height: 233px;
    left: 86px;
    position: absolute;
    top: 59px;
    width: 202px;
}
</style>
