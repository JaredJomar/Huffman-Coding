# Huffman Coding Project 

## Objective

The objective of this project, completed during the Spring 2022-2023 semester as part of CIIC 4020 / ICOM 4035 – Data Structures at the University of Puerto Rico, Mayagüez Campus, was to implement the Huffman Coding algorithm. Huffman Coding is an encoding algorithm that uses variable-length codes to compress data, giving shorter codes to more frequently occurring symbols.

## Project Overview

### Problem Statement

Suppose we have an alphabet of 'n' symbols and a long message consisting of symbols from this alphabet. The goal is to encode the message in a way that reduces its length and saves space.

For example, if there are 4 characters in the alphabet: A, B, C, and D, and the message is "BAACABAD," we explored different encoding methods:

1. Using ASCII code: Each character needs 8 bits, totaling 64 bits.
2. Using binary: Since there are only 4 symbols, 2 bits are enough to distinguish them: A (00), B (01), C (10), and D (11). The message can be encoded as "0100001000010011," requiring only 16 bits, saving 75% space.

Huffman Coding aims to further optimize encoding by assigning shorter codes to more frequent symbols.

### Implementation

The implementation involved several key steps:

1. Calculating the frequency distribution of symbols in the input.
2. Creating a Huffman tree, where nodes represent symbols and their frequencies.
3. Mapping each symbol to its corresponding Huffman code.
4. Encoding the input message using the Huffman codes.
5. Displaying the results, including the frequency distribution, original message, encoded message, and space savings.

## Usage

To use the Huffman Coding program:

1. Provide an input file named "stringData.txt" in the "inputData" directory.
2. Run the program, which will calculate frequencies, build the Huffman tree, encode the message, and display the results.
