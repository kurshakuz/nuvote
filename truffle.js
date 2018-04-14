// Allows us to use ES6 in our migrations and tests.
require('babel-register')

module.exports = {
  networks: {
    development: {
      host: '127.0.0.1',
      port: 7545,
      network_id: '*',
	  from: "0xaA79a6B0c02378119ed8490De6C18c042ADcc956",
      gas: 470000
    }
  }
}
