# SAS Conversation Designer Coding Assignment

#### Description
Natural Language Understanding (NLU) is a broad and complex area of computer science. We've designed this 
assignment as a toy problem in the space while hopefully giving you a chance to
 flex your ability to design and develop high quality software. 
 
In this exercise we're specifically looking at a simplified attempt at Intent Classification. In this
exercise you will be dealing with code that defines a Domain of knowledge about the kinds of text that
may be sent to this system. Within that Domain, there are different Intents that we hope to classify text into.
Each of those Intents is defined by a set of Utterances, or pieces of textual training data that can further be annotated using
entities.

#### The Assignment

##### Part 1 - Classify Intents
Implement the "interpret" method inside of a Domain. This should involve iterating through 
the defined intents and scoring them against the text given. This can and should 
be a very simple algorithm. There's no need to get fancy or try to build something production
ready.

##### Part 2 - Extend Domains
Add the ability of Domains to be extended from other Domains. For instance if I am writing 
a pizza ordering domain it might be useful to allow extending from a business domain
which contains intents that apply to all types of businesses (e.g. store hours).

##### Part 3 - Allow Other Entities
Develop several other types of entities. The default Entity class provides very limited
matching against values. Implement several other types of Entities which you might find useful
in your examples. These can include (but are not limited to) matching numbers, matching regex patterns, etc.

##### Running the code
Use the following command to run the unit tests for this project.
```
./gradlew test
```

#### External Libraries
Please feel free to use external libraries where appropriate. We've hopefully designed the assignment
in such a way that extensive knowledge and use of third-party libraries is not necessary. If you do 
include libraries please be prepared to explain their usage and why you chose those specific ones.

### Transparency
The structure of this exercise is very similar to a high level (and very simplified) view one of
the codebases we support. The parts above represent a very real set of requirements that our team
might encounter. We hope that you find working on them interesting and a slightly glimpse of what work
on our team may look like.

### Presentation
Be prepared to give a high level overview of your code in a virtual meeting. 

