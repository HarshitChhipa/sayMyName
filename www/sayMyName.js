var exec = require('cordova/exec');

module.exports = {
  sayMyName: function(stringPassed, callback) {
      exec(callback, null,  "SayMyName", "sayMyName", [stringPassed]);
  },
}
