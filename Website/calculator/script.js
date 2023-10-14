function appendToDisplay(value) {
    const display = document.getElementById('display');
    const currentValue = display.value;
    const lastCharacter = currentValue[currentValue.length - 1];
    
    if (/[-+*÷]/.test(lastCharacter) && /[-+*÷]/.test(value)) {

        display.value = currentValue.slice(0, -1) + value;
    } else {
        display.value += value;
    }
}


function clearDisplay() {
    document.getElementById('display').value = '';
}

function calculateResult() {
    const display = document.getElementById('display');
    const expression = display.value;

    try {
        const evalExpression = expression.replace(/÷/g, '/');
        const result = eval(evalExpression);

        display.value = result;
    } catch (error) {
        display.value = 'Error';
    }
}
