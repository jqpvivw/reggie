function loginApi(data) {
    return $axios({
      'url': '/user/login',
      'method': 'post',

    })
  }

function loginoutApi() {
  return $axios({
    'url': '/user/loginout',
    'method': 'post',
      data
  })
}

  