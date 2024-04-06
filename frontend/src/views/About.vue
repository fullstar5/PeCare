<template>
    <div class="box">
        <div class="cover-page">
            <div class="group">
                <div class="login-page">
                    <div class="overlap">
                        <div class="overlap-group">
                            <img class="img" alt="Group" src="/img/group.png" />
                            <img class="group-2" alt="Group"
                                src="src/screens/img/71b4a3984463bee3489c2ec5f160b95a-2.png" />
                            <img class="mask-group" alt="Mask group" src="/img/mask-group.png" />
                            <img class="mask-group-2" alt="Mask group" src="/img/mask-group-1.png" />
                            <img class="mask-group-3" alt="Mask group" src="/img/mask-group-2.png" />
                            <img class="img-2" alt="Img" src="/img/71b4a3984463bee3489c2ec5f160b95a-2.png" />
                            <div class="frame">
                                <div class="div">
                                    <div class="text-wrapper">About Us</div>
                                    <p class="welcome-to-pecare-a">
                                        Welcome to PeCare - a community driven by a profound love for animals and
                                        dedicated to their
                                        well-being. At PeCare, we understand the challenges faced by pet owners who may
                                        not always be
                                        available to care for their beloved companions due to work or other commitments.
                                        That&#39;s why
                                        we&#39;ve created a platform where passionate animal lovers volunteer their time
                                        to provide the
                                        care and attention your pets deserve when you&#39;re unable to.
                                    </p>
                                </div>
                                <div class="group-3">
                                    <div class="text-wrapper">Our Intention</div>
                                    <p class="p">
                                        Our mission at PeCare is rooted in the belief that every animal deserves to be
                                        cherished and cared
                                        for, regardless of their owner&#39;s circumstances. Our intention is to bridge
                                        the gap between pet
                                        owners and their furry friends by offering a reliable support system that
                                        ensures pets receive the
                                        love and care they need, even in the absence of their primary caregivers.
                                        Through our platform, we
                                        aim to foster a deeper connection between humans and animals, enriching both
                                        their lives in the
                                        process.
                                    </p>
                                </div>
                                <div class="group-4">
                                    <div class="text-wrapper">Special Features</div>
                                    <p class="p">
                                        Explore our insightful blog, where you&#39;ll find the latest updates from
                                        PeCare, heartwarming
                                        volunteer stories, and practical tips on pet care. Join us as we delve into the
                                        joys of pet
                                        ownership and discover new ways to nurture our four-legged companions.
                                    </p>
                                </div>
                                <img class="group-5" alt="Group" src="/img/group-20.png" />
                            </div>
                            <div class="customer-care">
                                <div class="div-wrapper">
                                    <div class="text-wrapper-2">Terms &amp; Conditions</div>
                                </div>
                                <div class="div-wrapper">
                                    <div class="text-wrapper-2">Support</div>
                                </div>
                                <div class="div-wrapper">
                                    <div class="text-wrapper-2">Customer Care</div>
                                </div>
                            </div>
                            <img class="group-6" alt="Group" src="/img/group-22.png" />
                        </div>
                        <img class="logo" alt="Logo" src="/img/logo.png" />
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
export default {
  name: "Box",
}
</script>


<style>
.box {
    height: 100%;
    top: 70%;
    width: 70%;
}

.box .cover-page {
    height: 100%;
    left: 0;
    position: absolute;
    top: 30%;
    width: 95%;
}

.box .group {
    height: 100%;
}

.box .login-page {
    background: radial-gradient(50% 50% at 50% 50%, rgb(249.49, 240.32, 216.76) 0%, rgb(255, 249.21, 110.33) 100%);
    height: 100%;
    width: 100%;
}

.box .overlap {
    height: 100%;
    position: relative;
    top: 10%;
}

.box .overlap-group {
    height: 100%;
    left: 0;
    position: absolute;
    top: 0;
    width: 100%;
}

.box .img {
    height: 559px;
    left: 0;
    mix-blend-mode: luminosity;
    position: absolute;
    top: 905px;
    width: 312px;
}

.box .group-2 {
    height: 757px;
    left: 1056px;
    mix-blend-mode: luminosity;
    position: absolute;
    top: 707px;
    width: 401px;
}

.box .mask-group {
    height: 445px;
    left: 945px;
    position: absolute;
    top: 372px;
    width: 493px;
}

.box .mask-group-2 {
    height: 379px;
    left: 110px;
    position: absolute;
    top: 469px;
    width: 386px;
}

.box .mask-group-3 {
    height: 583px;
    left: 0;
    position: absolute;
    top: 123px;
    width: 500px;
}

.box .img-2 {
    height: 233px;
    left: 121px;
    position: absolute;
    top: 32px;
    width: 202px;
}

.box .frame {
    -webkit-backdrop-filter: blur(53px) brightness(100%);
    backdrop-filter: blur(53px) brightness(100%);
    background: linear-gradient(180deg, rgba(191.25, 191.25, 191.25, 0.06) 0%, rgba(0, 0, 0, 0) 100%);
    border: 1px solid;
    border-color: transparent;
    border-image: linear-gradient(to bottom, rgb(255, 255, 255), rgba(0, 0, 0, 0)) 1;
    border-radius: 20px;
    box-shadow: 8px 4px 5px #0000003d;
    height: 100%;
    left: 10%;
    overflow: hidden;
    position: relative;
    top: 0;
    width: 85%;
}

.box .div {
    height: 20%;
    left: 5%;
    position: absolute;
    top: 5%;
    width: 100%;
}

.box .text-wrapper {
    color: #ffffff;
    font-family: "Noto Sans", Helvetica;
    font-size: 35px;
    font-weight: 600;
    left: 0;
    letter-spacing: 0;
    line-height: normal;
    position: absolute;
    top: 0;
}

.box .welcome-to-pecare-a {
    color: #ffffff;
    font-family: "Noto Sans", Helvetica;
    font-size: 20px;
    font-weight: 500;
    height: 204px;
    left: 0;
    letter-spacing: 0;
    line-height: normal;
    position: absolute;
    text-align: center;
    top: 70px;
    width: 920px;
}

.box .group-3 {
    height: 20%;
    left: 5%;
    position: absolute;
    top: 37%;
  width: 100%;
}

.box .p {
    color: #ffffff;
    font-family: "Noto Sans", Helvetica;
    font-size: 20px;
    font-weight: 500;
    height: 253px;
    left: 0;
    letter-spacing: 0;
    line-height: normal;
    position: absolute;
    text-align: center;
    top: 54px;
    width: 913px;
}

.box .group-4 {
    height: 33%;
    left: 5%;
    position: absolute;
    top: 70%;
    width: 100%;
}

.box .group-5 {
    height: 70px;
  left: 5%;
    position: absolute;
    top: 1001px;
    width: 364px;
}

.box .customer-care {
    align-items: center;
    background: linear-gradient(180deg,
            rgba(245.99, 242.25, 152.46, 0.58) 0%,
            rgba(255, 104.63, 77.56, 0.4) 94.5%,
            rgba(255, 229.5, 0, 0.4) 100%);
    border-radius: 30px;
    box-shadow: 10px 5px 4px #00000040;
    display: flex;
    height: 45px;
    justify-content: space-between;
    left: 482px;
    padding: 4px 6px;
    position: absolute;
    top: 1215px;
    width: 495px;
}

.box .div-wrapper {
    align-items: flex-start;
    display: inline-flex;
    flex: 0 0 auto;
    gap: 10px;
    position: relative;
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

.box .group-6 {
    height: 108px;
    left: 252px;
    position: absolute;
    top: 1117px;
    width: 998px;
}

.box .logo {
    height: 126px;
    left: 1308px;
    position: absolute;
    top: 19px;
    width: 134px;
}
</style>
