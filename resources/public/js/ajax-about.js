addEventListener("DOMContentLoaded", getAbout('main'));

function getAbout(who) {
    var request = new XMLHttpRequest();
    request.open("GET", "/about/" + who);
    request.onreadystatechange = function() {
        if (request.readyState == 4) {
            var response = request.responseText;
            $('#about').html(response);
        }
    }
    request.send();
};
