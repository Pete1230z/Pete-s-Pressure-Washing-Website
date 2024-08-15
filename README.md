# WESTERN GOVERNORS UNIVERSITY 
## D287 – JAVA FRAMEWORKS

## Task Instructions Provided for Reference

Each note should include the prompt, file name, line number, and change.

## Tracked Changes 

C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
Note: Do not remove any elements that were included in the screen. You may add any additional elements you would like or any images, colors, and styles, although it is not required.

<strong>Filename: mainscreen.html</strong>

Line 14: Changed title to Pete's Pressure Washing
```html
<title>Pete's Pressure Washing</title>
```
Line 19: Changed h1 to Pete's Pressure Washing
```html
<h1>Pete's Pressure Washing</h1>
```
Line 21: Changed h2 to Pressure Washing Parts
```html
<h2>Pressure Washing Parts</h2>
```
Line 53: Changed h2 to Pressure Washing Products
```html
<h2>Pressure Washing Products</h2>
```
Lines 91-93: Added a footer
```html
<footer>
    Copyright 2024, Pete's Pressure Washing
</footer>
```
Lines 97-121: Added CSS Styling
```html
<style>
    * {
        border: 1px solid black;
    }
    body {
        background: #DAA520;
        color: #fff;
    }

    .container {
        background: #DAA520;
        color: #0d6efd;
    }

    .footer {
        position: fixed;
        left: 0;
        bottom: 0;
        width: 100%;
        background-color: #333;
        color: white;
        text-align: center;
    }

</style>
```

D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.

<strong>Filename: about.html</strong>

Lines 1-54: Added About.html page with layout and content
```html
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
  <meta charset="UTF-8">

  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">

  <!-- Bootstrap CSS -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

  <title>Pete's Pressure Washing</title>
</head>
<body>
  <div class="container"></div>
   <h1>About Us</h1>
   <a href="mainscreen.html">Back to Main Screen</a>
   <p>Our company has been in business for over 20 years. We specialize in pressure washing parts and products. We have a wide selection of parts and products to choose from. We also offer in house and outsourced parts. Our prices are competitive and our customer service is top-notch. We look forward to doing business with you!</p>
   <h1>Our Products</h1>
   <p>At Pete's Pressure Washing, we are committed to using only the highest quality products, sourced from the best suppliers in the industry. This ensures that every job we undertake is not only completed to the highest standards but also with the most effective and reliable products available.</p>
</body>
</html>
<footer>
    Copyright 2024, Pete's Pressure Washing
</footer>

<!--CSS Styling-->
<style>
  * {
    border: 1px solid black;
  }
  body {
    background: #DAA520;
    color: #fff;
  }

  .container {
    background: #DAA520;
    color: #0d6efd;
  }

  .footer {
    position: fixed;
    left: 0;
    bottom: 0;
    width: 100%;
    background-color: #333;
    color: white;
    text-align: center;
  }

</style>
```
<strong>Filename: mainscreen.html</strong>

Line 17: Added a link to the about page
```html
<a href="about.html">About Us</a>
```
Line 17: Refined the link to the about page
```html
<a id="aboutbutton" class="btn btn-primary aboutbutton" href="about.html">About Us</a>
```

<strong>Filename: MainScreenController.java</strong>

Line 

E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.
Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your products. When duplicate items are added, make a “multi-pack” part.


F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
•  The “Buy Now” button must be next to the buttons that update and delete products.
•  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
•  Display a message that indicates the success or failure of a purchase.


G.  Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.


H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.


I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.


J.  Remove the class files for any unused validators in order to clean your code.


K.  Demonstrate professional communication in the content and presentation of your submission.


## File Restrictions
File name may contain only letters, numbers, spaces, and these symbols: ! - _ . * ' ( )
File size limit: 200 MB
File types allowed: doc, docx, rtf, xls, xlsx, ppt, pptx, odt, pdf, csv, txt, qt, mov, mpg, avi, mp3, wav, mp4, wma, flv, asf, mpeg, wmv, m4v, svg, tif, tiff, jpeg, jpg, gif, png, zip, rar, tar, 7z