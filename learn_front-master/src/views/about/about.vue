<template>
  <div class="about">
	  <headerPage></headerPage>
	  <div class="content">
		  <div class="about-content">
			  <div class="about-desc">
				<div style="font-weight:bold">职业技能在线教育系统</div>
				<div>作者：康骏欣</div>
				<div>学校：广州软件学院</div>
				<div>院系：软件工程系</div>
				<div>专业：软件工程专业</div>
				<div>邮箱：3091191086@qq.com</div>
				<div>Q Q：3091191086</div>
				<div>微信：3091191086x</div>
				<div>电话：13544250723</div>
			  </div>
			  <img style="width:59%" src="../../assets/image/about/about.jpeg">
		  </div>
	  </div>
  </div>
</template>

<script>
  import headerPage from "../../components/header/header"
  export default {
	data() {
	  return{

	  }
	},
	components: {
		headerPage,
	},
	methods: {


	},
	created() {

	},
	mounted() {

	}
 }
</script>

<style scoped>
@import url("../../assets/css/about/about.css");
</style>