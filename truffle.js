// Allows us to use ES6 in our migrations and tests.
var HDWalletProvider = require("truffle-hdwallet-provider");
var mnemonic = "wisdom mandate envelope equal neglect library able purse endless year chair gold";
require('babel-register')

module.exports = {
  networks: {
    ropsten: {
      provider: function() {
        return new HDWalletProvider(mnemonic, "https://ropsten.infura.io/BtiNCjNdPdt4ElgToukp")
      },
      network_id: 3
    // development: {
    //   host: '127.0.0.1',
    //   port: 8545,
    //   network_id: '*'
    // },
    // rinkeby: {
    //   host: "localhost", // Connect to geth on the specified
    //   port: 8545,
    //   from: "0x15Aea6dCE8f8EeD62D4F5462eE9DF241dbf5f637", // default address to use for any transaction Truffle makes during migrations
    //   network_id: 4,
    //   gas: 4612388 // Gas limit used for deploys
     }
  }
};
