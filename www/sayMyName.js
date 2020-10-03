var exec = require('cordova/exec');

module.exports = {
  sayMyName: function(stringPassed, callback) {
      exec(callback, callback, "SayMyName", "sayMyName", [stringPassed]);
  },
}
