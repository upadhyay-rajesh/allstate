/*var BigDecim al = Java.type('java.math.BigDecimal');
function calculate(amount, percentage) {
var result = new BigDecim al(am ount).m ultiply(
new BigDecim al(percentage)).divide(new BigDecim al("100"), 2,
BigDecim al.ROUND_HALF_EVEN);
return result.toPlainString();
}
var result = calculate(568000000000000000023,13.9);
print(result);
*/
var fun1 = function(name) {
    print('Hi there from Javascript, ' + name);
    return "greetings from javascript";
};

var fun2 = function (object) {
    print("JS Class Definition: " + Object.prototype.toString.call(object));
};