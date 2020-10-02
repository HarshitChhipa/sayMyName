var exec = require("cordova/exec");

// exports.coolMethod = function (arg0, success, error) {
//     exec(success, error, 'sayMyName', 'coolMethod', [arg0]);
// };
var sayMyName = function (str, callback) {
  exec(
    callback,
    function (err) {
      callback("I broke somewhere while processing.");
    },
    "SayMyName",
    "sayMyName",
    [str]
  );
};

module.exports = sayMyName;