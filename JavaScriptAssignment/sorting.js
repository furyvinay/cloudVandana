const array = [4, 2, 8, 1, 6, 9, 5];

array.sort(function(a, b) {
    return b - a;
});

console.log(array); // Output: [9, 8, 6, 5, 4, 2, 1]