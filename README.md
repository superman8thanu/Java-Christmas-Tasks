# Java-Christmas-Tasks
Thanu: This Repository contains my Java Christmas task. Which includes my improved code and my README.md file explaining my testing process, changes and results.

# **Start Up:** 

1. All the necessary files are in the GitHub repository.
2. Run using IntellliJ (11.0.5+)
3. Add Junit5 to the class files.

## **Test Procedure:**

The test process which was commenced was a 4-way test. Phase one which concluded of a test planning section. Where planning would take place for all the tests that are to be undertaken. Phase two, the test design phase, which would focus on testing on the design. Phase three which would focus on execution testing. Then the final phase four, which would conclude of the final test report.

### **Section 1 - Planning:**

Design Testing:

1. Correctly spelt strings

Execution Testing:

1. Correct Modulus Functionality
2. Correct FizzBuzz Operation

### **Section 2 &amp; 3 – Design And Execution Testing:**

| Test Scenario ID: | 001 | Test Name: | Verify Fizz, Buzz and FizzBuzz is correctly outputted. |
| --- | --- | --- | --- |
| Test Priority: | High | Test Description: | Check if spelling of Fizz, Buzz and FizzBuzz has been correctly outputted. |
| Test Designed Date: | 01/01/2020 | Test Executed By: | Thanu |
| Test Executed Date: | 01/01/2020 | Test Designed By: | Thanu |

| Steps: | Test Steps: | Test Data: | Expected: | Results & Changes: | Status: |
| --- | --- | --- | --- | --- | --- |
| 1 | Spell Check | Fizz | String should be spelt correctly. | Ran an array test and Fizz was spelt correctly. | Pass |
| 2 | Spell Check | Buzz | String should be spelt correctly. | Ran an array test and Buzz was spelt incorrectly. Changes were made. | Not Pass.Changes were made and now Pass. |
| 3 | Spell Check | FizzBuzz. | String should be spelt correctly. | Ran an array test and FizzBuzz was spelt correctly. | Pass |



| Test Scenario ID: | 002 | Test Name: | Modulus Verification |
| --- | --- | --- | --- |
| Test Priority: | High | Test Description: | Check if the Modulus function is operating as it should. |
| Test Designed Date: | 01/01/2020 | Test Executed By: | Thanu |
| Test Executed Date: | 01/01/2020 | Test Designed By: | Thanu |

| Steps: | Test Steps: | Test Data: | Expected: | Results & Changes: | Status: |
| --- | --- | --- | --- | --- | --- |
| 1 | Check Modulus | (4, 2) | 4 mod 2 should return true, as there are no reminders. | Return was not a pass, found an error. After running   ```Assert._assertTrue_(FizzBuzzGenerator._divisibleBy_(4,2) ); ```   Changes were made, from this: ```return numerator % Denominator == 2; ``` to this:  ```return numerator % Denominator == 0; ```Which after retesting solved the issue. | Not pass at first, after alterations were made, resulted in a pass. |
| 2 | Check Modulus | (3, 2) | 3 mod 2 has no reminders, so its false. In the test should return true, as test itself states it should be false. | Returned a pass as expected. After running: ```_Assert.assertFalse__(FizzBuzzGenerator.__divisibleBy(3,2) );```  | Pass |
| 3 | Check Modulus | (15, 3) | 15 mod 3 should return true, as there are no reminders. | Returned a pass as expected. After running: ```_Assert.assertTrue__(FizzBuzzGenerator.__divisibleBy(15,3) );```  | Pass |
| 4 | Check Modulus | (20, 5) | 20 mod 5 should return true, as there are no reminders. | Returned a pass as expected. After running: ```_Assert.assertTrue__(FizzBuzzGenerator.__divisibleBy(20,5) ); ```  | Pass |



| Test Scenario ID: | 003 | Test Name: | Verify the FizzBuzz operation works. |
| --- | --- | --- | --- |
| Test Priority: | High | Test Description: | Check if the FizzBuzz operation is fully functional with any array. |
| Test Designed Date: | 01/01/2020 | Test Executed By: | Thanu |
| Test Executed Date: | 01/01/2020 | Test Designed By: | Thanu |

| Steps: | Test Steps: | Test Data: | Expected: | Results & Changes: | Status: |
| --- | --- | --- | --- | --- | --- |
| 1 | Check if functionally works with a manually create array up to 15. | { &quot;1&quot; , &quot;2&quot; , &quot;Fizz&quot; , &quot;4&quot; , &quot;Buzz&quot; , &quot;Fizz&quot; , &quot;7&quot; , &quot;8&quot; , &quot;Fizz&quot; , &quot;Buzz&quot; , &quot;11&quot; , &quot;Fizz&quot; , &quot;13&quot; , &quot;14&quot; , &quot;FizzBuzz&quot; } | Output should be passed (meaning its working correctly). | Test did not result in a pass, as the output was different to what was expected. However, after reading the error code, changes were made from this: ```if (_divisibleBy_(i, 3) 'OR'  _divisibleBy_(i, 5)) ``` to this: ```if (_divisibleBy_(i, 3) && _divisibleBy_(i, 5)) ```   | Did not pass at first, but changes were made which resulted in a pass. |
| 2 | Check if functionally works with a manually create array up to 33. | {&quot;1&quot; , &quot;2&quot; , &quot;Fizz&quot; , &quot;4&quot; , &quot;Buzz&quot; , &quot;Fizz&quot; , &quot;7&quot; , &quot;8&quot; , &quot;Fizz&quot; , &quot;Buzz&quot; , &quot;11&quot; , &quot;Fizz&quot; , &quot;13&quot; , &quot;14&quot; , &quot;FizzBuzz&quot; , &quot;16&quot; , &quot;17&quot; , &quot;Fizz&quot; , &quot;19&quot; , &quot;Buzz&quot; , &quot;Fizz&quot; , &quot;22&quot; , &quot;23&quot; , &quot;Fizz&quot; , &quot;Buzz&quot; , &quot;26&quot; , &quot;Fizz&quot; , &quot;28&quot; , &quot;29&quot; , &quot;FizzBuzz&quot; , &quot;31&quot; , &quot;32&quot; , &quot;Fizz&quot; } | Output should be passed (meaning its working correctly). | Test did pass, which showed the functionality of the FizzBuzz was operating correctly. |   |

### **Section 4 – Test Report:**

Overall the FizzBuzz program had the main concept done. However, there were minor tweaks which needed to be made in order to make the program fully functional. These were picked up during the tests. The main adjustments which was undertaken was within the &#39;if&#39; statement (which is within the &#39;for&#39; loop). The symbol change from OR to AND. (From this &#39;||&#39; to &#39;&amp;&amp;&#39;). 
From this:
```Java 
if(divisibleBy(i, 3) || divisibleBy(i, 5))
```
To:
```Java 
if(divisibleBy(i, 3) && divisibleBy(i, 5))
```

This was found upon in test ID 003. Additionally, the testing also resulted in adjusting the &#39;divisibleby&#39; method which was for the modulus. The change was from this:

```Java 
numerator % Denominator == 2;
```
To: 
```Java
numerator % Denominator == 0;
```
this was found upon in test ID 002. After doing these tests it allowed the FizzBuzz program to make sure its fully functional without any errors.
