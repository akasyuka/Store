function name() {
alert('Hello!');
} 
window.onload function() {
let btn = document.getElementById("alert");
btn.onclick = name();
}