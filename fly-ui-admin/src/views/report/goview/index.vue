<template>
  <div>
    <i-frame :src="url" />
  </div>
</template>
<script>
import iFrame from "@/components/iFrame/index";
export default {
  name: "GoView",
  components: { iFrame },
  data() {
    return {
      url: 'http://127.0.0.1:3000',
    };
  },
};
</script>
