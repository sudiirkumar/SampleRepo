const http = require('http');
http.createServer((req, res) => {
    const userInput = req.url.substring(1); // Unsafe: Directly using user input
    res.writeHead(200, { 'Content-Type': 'text/html' });
    res.end(`<h1>${userInput}</h1>`); // Vulnerable to XSS
}).listen(3000);

console.log('Server running at http://localhost:3000/');
