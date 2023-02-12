USE Northwind
GO

SELECT * FROM [dbo].[Employees]

SELECT * FROM Products

SELECT ProductID 'Codigo Producto', ProductName 'Descripcion del Producto'
	, UnitPrice 'Precio Unitario', UnitsInStock 'Stock'
FROM Products
WHERE ProductID = '15'

SELECT * FROM Categories

SELECT * FROM Products TP, Categories TC
WHERE ProductID = '15' 

SELECT * FROM Products TP, Categories TC
WHERE ProductID = '15' AND TP.CategoryID = TC.CategoryID

SELECT TP.ProductID 'Cod-Prod', TP.ProductName 'Descripcion', TP.UnitPrice 'Precio Unit.', TC.CategoryName 'Categoria'  
FROM Products TP, Categories TC
WHERE ProductID = '15' AND TP.CategoryID = TC.CategoryID