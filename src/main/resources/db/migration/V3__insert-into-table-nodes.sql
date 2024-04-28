INSERT INTO Nodes (type, title, description, parent_node) VALUES
('SKILL', 'Internet', 'The Internet is a global network of computers connected to each other which communicate through a standardized set of protocols.', NULL),
('TASK', 'How does the Internet Work?', 'The Internet is a global network of computers connected to each other which communicate through a standardized set of protocols.', 1),
('LINK', 'How Does the Internet Work?', 'https://cs.fyi/guide/how-does-internet-work', 2),
('LINK', 'How Does the Internet Work? MDN Docs', 'https://developer.mozilla.org/en-US/docs/Learn/Common_questions/How_does_the_Internet_work', 2),
('TASK', 'What is HTTP?', 'HTTP is the TCP/IP based application layer communication protocol which standardizes how the client and server communicate with each other. HTTP follows a classical “Client-Server model” with a client opening a connection request, then waiting until it receives a response. HTTP is a stateless protocol, that means that the server does not keep any data (state) between two requests.', 1),
('LINK', 'What is HTTP?', 'https://www.cloudflare.com/en-gb/learning/ddos/glossary/hypertext-transfer-protocol-http/', 5),
('LINK', 'Everything you need to know about HTTP', 'https://cs.fyi/guide/http-in-depth', 5),
('TASK', 'What is a Domain Name?', 'A domain name is a unique, easy-to-remember address used to access websites, such as ‘google.com’, and ‘facebook.com’. Users can connect to websites using domain names thanks to the Domain Name System (DNS).', 1),
('LINK', 'What is a Domain Name?', 'https://developer.mozilla.org/en-US/docs/Learn/Common_questions/What_is_a_domain_name', 8),
('LINK', 'What is a Domain Name? | Domain name vs. URL', 'https://www.cloudflare.com/en-gb/learning/dns/glossary/what-is-a-domain-name/', 8),
('TASK', 'What is Hosting?', 'Web hosting is an online service that allows you to publish your website files onto the internet. So, anyone who has access to the internet has access to your website.', 1),
('LINK', 'What Is Web Hosting? Explained', 'https://www.youtube.com/watch?v=htbY9-yggB0', 11),
('LINK', 'Different Types of Web Hosting Explained', 'https://www.youtube.com/watch?v=AXVZYzw8geg', 11),
('TASK', 'DNS and how it Works?', 'The Domain Name System (DNS) is the phonebook of the Internet. Humans access information online through domain names, like nytimes.com or espn.com. Web browsers interact through Internet Protocol (IP) addresses. DNS translates domain names to IP addresses so browsers can load Internet resources.', 1),
('LINK', 'What is DNS?', 'https://www.cloudflare.com/en-gb/learning/dns/what-is-dns/', 14),
('LINK', 'DNS and How does it Work?', 'https://www.youtube.com/watch?v=Wj0od2ag5sk', 14),
('TASK', 'Browsers and how they Work?', 'A web browser is a software application that enables a user to access and display web pages or other online content through its graphical user interface.', 1),
('LINK', 'How Browsers Work', 'https://www.html5rocks.com/en/tutorials/internals/howbrowserswork/', 17),
('LINK', 'How Do Web Browsers Work?', 'https://www.youtube.com/watch?v=WjDrMKZWCt0', 17),
('SKILL', 'HTML', 'HTML stands for HyperText Markup Language. It is used on the frontend and gives the structure to the webpage which you can style using CSS and make interactive using JavaScript.', NULL),
('TASK', 'Learn the basics', 'HTML stands for HyperText Markup Language. It is used on the frontend and gives the structure to the webpage which you can style using CSS and make interactive using JavaScript.', 20),
('LINK', 'MDN Docs: Getting Started with HTML', 'https://developer.mozilla.org/en-US/docs/Learn/HTML/Introduction_to_HTML/Getting_started', 21),
('LINK', 'web.dev: Learn HTML', 'https://web.dev/learn/html', 21),
('TASK', 'Writing Semantic HTML', 'Semantic element clearly describes its meaning to both the browser and the developer. In HTML, semantic element are the type of elements that can be used to define different parts of a web page such as <form>, <table>, <article>, <header>, <footer>, etc.', 20),
('LINK', 'Guide to Writing Semantic HTML', 'https://cs.fyi/guide/writing-semantic-html', 24),
('LINK', 'HTML Best Practices – How to Build a Better HTML-Based Website', 'https://www.freecodecamp.org/news/html-best-practices/', 24),
('TASK', 'Forms and Validations', 'Before submitting data to the server, it is important to ensure all required form controls are filled out, in the correct format. This is called client-side form validation, and helps ensure data submitted matches the requirements set forth in the various form controls.', 20),
('LINK', 'MDN Web Docs: Client-side form validation', 'https://developer.mozilla.org/en-US/docs/Learn/Forms/Form_validation', 27),
('LINK', 'Learn Forms by web.dev', 'https://web.dev/learn/forms/', 27),
('TASK', 'Accessibility', 'Web accessibility means that websites, tools, and technologies are designed and developed in such a way that people with disabilities can use them easily.', 20),
('LINK', 'Developing for Web Accessibility by W3C WAI', 'https://www.w3.org/WAI/tips/developing/', 30),
('LINK', 'MDN Accessibility', 'https://developer.mozilla.org/en-US/docs/Web/Accessibility', 30),
('TASK', 'SEO Basics', 'SEO or Search Engine Optimization is the technique used to optimize your website for better rankings on search engines such as Google, Bing etc.', 20),
('LINK', 'SEO Guide', 'https://github.com/seo/guide', 33),
('LINK', 'SEO for Developers', 'https://medium.com/welldone-software/seo-for-developers-a-quick-overview-5b5b7ce34679', 33),
('SKILL', 'CSS', 'CSS or Cascading Style Sheets is the language used to style the frontend of any website. CSS is a cornerstone technology of the World Wide Web, alongside HTML and JavaScript.', NULL),
('TASK', 'Learn the basics', 'CSS or Cascading Style Sheets is the language used to style the frontend of any website. CSS is a cornerstone technology of the World Wide Web, alongside HTML and JavaScript.', 34),
('LINK', 'web.dev — Learn CSS', 'https://web.dev/learn/css/', 37),
('LINK', 'Learn to Code HTML & CSS', 'https://learn.shayhowe.com/html-css/building-your-first-web-page/', 37),
('TASK', 'Making layouts', 'Float, grid, flexbox, positioning, display and box model are some of the key topics that are used for making layouts. Use the resources below to learn about these topics:', 34),
('LINK', 'Learn and Practice Flexbox', 'https://flexboxfroggy.com/', 40),
('LINK', 'A Complete Guide to Grid', 'https://css-tricks.com/snippets/css/complete-guide-grid', 40);