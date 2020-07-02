(function() {

    var form = document.form_register,
        elements = form.elements;

    var validateInputs = function() {
        for (var i = 0; i < elements.length; i++) {
            if (elements[i].type == "text" || elements[i].type == "email" || elements[i].type == "password") {
                if (elements[i].value.length == 0) {
                    console.log('El campo ' + elements[i].name + ' esta incompleto');
                    elements[i].className = elements[i].className + " error";
                    return false;
                } else {
                    elements[i].className = elements[i].className.replace(" error", "");
                }
            }
        }

        if (elements.pass.value !== elements.pass2.value) {
            elements.pass.value = "";
            elements.pass2.value = "";
            elements.pass.className = elements.pass.className + " error";
            elements.pass2.className = elements.pass2.className + " error";
        } else {
            elements.pass.className = elements.pass.className.replace(" error", "");
            elements.pass2.className = elements.pass2.className.replace(" error", "");
        }

        return true;
    };

    var validateCheckbox = function() {
        var opciones = document.getElementsByName('terms'),
            resultado = false;

        for (var i = 0; i < elements.length; i++) {
            if (elements[i].type == "checkbox") {
                for (var o = 0; o < opciones.length; o++) {
                    if (opciones[o].checked) {
                        resultado = true;
                        break;
                    }
                }

                if (resultado == false) {
                    elements[i].parentNode.className = elements[i].parentNode.className + " error";
                    console.log('El campo checkbox esta incompleto');
                    return false;
                } else {
                    elements[i].parentNode.className = elements[i].parentNode.className.replace(" error", "");
                    return true;
                }
            }
        }
    };

    var enviar = function(e) {
        if (!validateInputs()) {
            console.log('Falto validar los Input');
            e.preventDefault();
        } else if (!validateCheckbox()) {
            console.log('Falto validar Checkbox');
            e.preventDefault();
        } else {
            console.log('Envia');
            e.preventDefault();
        }
    };

    var focusInput = function() {
        this.parentElement.children[1].className = "label active";
        this.parentElement.children[0].className = this.parentElement.children[0].className.replace("error", "");
    };

    var blurInput = function() {
        if (this.value <= 0) {
            this.parentElement.children[1].className = "label";
            this.parentElement.children[0].className = this.parentElement.children[0].className + " error";
        }
    };

    form.addEventListener("submit", enviar);

    for (var i = 0; i < elements.length; i++) {
        if (elements[i].type == "text" || elements[i].type == "email" || elements[i].type == "password") {
            elements[i].addEventListener("focus", focusInput);
            elements[i].addEventListener("blur", blurInput);
        }
    }

}())