# Week 5 - React Exercise 1

# Creating Your First React Application

## Objectives

- Define Single Page Application (SPA) and its benefits.
- Define React and understand how it works.
- Identify the differences between SPA and MPA.
- Explain the advantages and disadvantages of Single Page Applications.
- Explain React.
- Define Virtual DOM.
- Explain the features of React.
- Set up a React development environment.
- Create a React application using Create React App.
- Run a React application successfully.

---

# Prerequisites

Before starting the exercise, install the following software:

- Node.js
- npm (comes with Node.js)
- Visual Studio Code

---

# Theory

## 1. What is a Single Page Application (SPA)?

A Single Page Application (SPA) is a web application that loads a single HTML page initially. Instead of loading a new page for every request, only the required content is updated dynamically using JavaScript, providing a smoother and faster user experience.

---

## 2. Benefits of SPA

- Faster navigation after the initial page load.
- Better user experience.
- Reduced server load.
- Lower bandwidth consumption.
- Smooth page transitions.
- Efficient communication with REST APIs.

---

## 3. Difference Between SPA and MPA

| Single Page Application (SPA) | Multi Page Application (MPA) |
|-------------------------------|------------------------------|
| Loads a single HTML page | Loads a new HTML page for every request |
| Fast navigation | Slower due to page reloads |
| Better user experience | Traditional navigation |
| Uses JavaScript frameworks like React | Mostly server-side rendered |
| Dynamic content updates | Entire page reloads |

---

## 4. Advantages of SPA

- High performance
- Better user experience
- Fast page rendering
- Easy API integration
- Lower server requests
- Reusable components

---

## 5. Disadvantages of SPA

- Initial loading time is higher.
- SEO is comparatively difficult.
- Requires JavaScript to function.
- Browser history management is more complex.

---

## 6. What is React?

React is an open-source JavaScript library developed by Facebook for building fast and interactive user interfaces. It follows a component-based architecture, allowing developers to build reusable UI components and efficiently update the page using the Virtual DOM.

---

## 7. What is Virtual DOM?

The Virtual DOM is a lightweight copy of the Real DOM maintained by React. Whenever data changes, React creates a new Virtual DOM, compares it with the previous one, identifies the differences, and updates only the modified elements in the Real DOM. This process improves application performance.

---

## 8. Features of React

- Component-Based Architecture
- Virtual DOM
- JSX (JavaScript XML)
- One-Way Data Binding
- Reusable Components
- High Performance
- Declarative UI
- Easy Debugging
- Strong Community Support

---

# Procedure

## Step 1: Install Node.js

Download Node.js from:

https://nodejs.org/en/download/

Verify installation:

```bash
node -v
npm -v
```

---

## Step 2: Create a React Application

Open Command Prompt and execute:

```bash
npx create-react-app myfirstreact
```

---

## Step 3: Navigate to the Project

```bash
cd myfirstreact
```

---

## Step 4: Open the Project in Visual Studio Code

```bash
code .
```

---

## Step 5: Open App.js

Navigate to:

```
src
 └── App.js
```

Delete the existing code.

Replace it with:

```javascript
function App() {
  return (
    <div>
      <h1>Welcome to the first session of React</h1>
    </div>
  );
}

export default App;
```

---

## Step 6: Run the Application

Execute:

```bash
npm start
```

---

## Step 7: View the Output

Open your browser and visit:

```
http://localhost:3000
```

---

# Commands Used

```bash
node -v
```

```bash
npm -v
```

```bash
npx create-react-app myfirstreact
```

```bash
cd myfirstreact
```

```bash
code .
```

```bash
npm start
```

---

# Project Structure

```
Week 5
│
└── React Exercise 1
    │
    ├── README.md
    ├── Screenshots
    │
    └── myfirstreact
        │
        ├── package.json
        ├── public
        ├── src
        │   ├── App.js
        │   ├── index.js
        │   └── ...
        └── ...
```

---

# Source Code (App.js)

```javascript
function App() {
  return (
    <div>
      <h1>Welcome to the first session of React</h1>
    </div>
  );
}

export default App;
```

---

# Expected Output

```
Welcome to the first session of React
```

---

# Result

A React application named **myfirstreact** was successfully created using **Create React App**. The application was executed using the `npm start` command, and the browser displayed the heading:

**Welcome to the first session of React**

Thus, the objectives of understanding React, Single Page Applications (SPA), Virtual DOM, and setting up a React development environment were successfully achieved.