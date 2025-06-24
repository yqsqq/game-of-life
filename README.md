# Game of Life

A Java implementation of Conway's Game of Life.

## Description

This project is an implementation of Conway's Game of Life. It is built using Java and Maven.

## Prerequisites

- Java Development Kit (JDK) 1.8 or higher
- Apache Maven 3.2+

## Installation

1.  **Clone the repository:**
    ```bash
    git clone <repository-url>
    cd game-of-life
    ```

2.  **Build the project:**
    Use Maven to build the project and install dependencies:
    ```bash
    mvn clean install
    ```
    This will also run the Checkstyle and Cobertura plugins to ensure code quality and test coverage.

## Usage

This is a test project and does not have specific usage instructions for running a simulation. The primary purpose is to demonstrate a Java project setup with Maven, Checkstyle, and Cobertura.

## Running Tests

To run the unit tests:
```bash
mvn test
```

## Checkstyle

This project uses Checkstyle to enforce coding standards. The Checkstyle configuration can be found in `src/config/checkstyle.xml`. To run Checkstyle:
```bash
mvn checkstyle:check
```

## Code Coverage

Code coverage is measured using Cobertura. To generate a coverage report:
```bash
mvn cobertura:cobertura
```
The report can be found in `target/site/cobertura/index.html`. The project aims for a minimum of 80% branch and line coverage.

## Contributing

Contributions are welcome! Please follow the existing coding style and ensure all tests pass before submitting a pull request.

(Optional: Add more specific contribution guidelines if needed, e.g., issue tracking, branching model.)

## License

This project is licensed under the Apache License, Version 2.0. See the [LICENSE](LICENSE.txt) file for details (though a formal LICENSE.txt file may not be present in this test project).

You may obtain a copy of the License at:

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUTHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
