<template>
  <div id="app">
    {{info}}
  </div>
</template>

<script>
export default {
  name: "app",
  data() {
    return {
      info: "123",
    }
  },
  created() {
    console.log("111111111111111")
    this.axios
      .get('/api')
      .then(response => (this.info = response.data))
  },
  methods: {
  }
};
</script>

<style>
#app {
  font-family: "Avenir", Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
