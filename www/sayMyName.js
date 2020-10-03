var exec = require('cordova/exec');

module.exports = {
  match: function(stringPassed, callback) {
      exec(callback, callback, "SayMyName", "sayMyName", [stringPassed]);
  },
}
