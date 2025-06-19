## Explanation of working of Factory Method Pattern in Java

### Product Interface (Document.java)

- A public interface called Document is created which has a common method `create()`.

### Concrete Products (WordDocument.java, PdfDocument.java, ExcelDocument.java)

- These implement the Document interface and override the method `create()`.

### Creator (DocumentFactory.java)

- An abstract class which declares the facotry method CreateDocument().

### Concrete Factories (WordFactory.java, PdfFactory.java, ExcelFactory.java)

- These extend the DocumentFactory.java and overrides the `CreateDocument()` to instantiate its respective Document.

### Testing the implementation (FactoryTest.java)

- Chooses a concrete factory at runtime, calls createDocument(), and then works with the returned Document without knowing the concrete class.
