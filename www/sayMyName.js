var exec = require('cordova/exec');

// exports.coolMethod = function (arg0, success, error) {
//     exec(success, error, 'sayMyName', 'coolMethod', [arg0]);
// };
window.sayMyName = function(str, callback) {
    cordova.exec(callback, function(err) { callback('Nothing to echo.');}, "SayMyName", "sayMyName", [str]);
};