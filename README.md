# Huffman Coding Project

## Objective

The objective of this project is to implement Huffman Coding, an encoding algorithm that uses variable-length codes to compress data. The goal is to encode a given message in a way that more frequent symbols are assigned shorter codes, thus reducing the overall size of the encoded message.

## Methodology

The project involves the following steps:
1. Calculating the frequency distribution of symbols in the input text.
2. Constructing a Huffman tree using the frequency distribution.
3. Mapping symbols to their corresponding Huffman codes.
4. Encoding the input text using the generated Huffman codes.
5. Displaying the frequency distribution table, original message, encoded message, and compression savings.

## Implementation Details

The implementation is organized into several methods:
- `load_data`: Reads an input file and returns its contents as a string.
- `compute_fd`: Calculates the frequency distribution of symbols in the input string.
- `huffman_tree`: Constructs a Huffman tree based on the frequency distribution.
- `huffman_code`: Creates a mapping of symbols to their Huffman codes.
- `encode`: Encodes the input string using the Huffman codes.
- `process_results`: Displays the results on the screen as per the specifications.

## Documentation

The code is documented using Javadoc-style comments, providing explanations for classes, methods, and their functionality. The HTML documentation is generated using tools available in Eclipse and can be found in the `doc` directory of this repository.

## Academic Integrity

Please note that sharing code is strictly prohibited. While discussions on design and implementation strategies are allowed, any similarities in code implementation may result in academic penalties. It's important to maintain integrity and seek help if needed.

## Submission

The project is submitted through GitHub Classroom by the specified deadline. Be sure to adhere to the guidelines and submit your code according to the instructions provided by the course.

For further information, refer to the original project specifications provided by the course instructor.

---
*This project was completed as part of the CIIC 4020 / ICOM 4035 Data Structures course at the University of Puerto Rico, Mayagüez Campus, during the Spring semester of 2022-2023.*
