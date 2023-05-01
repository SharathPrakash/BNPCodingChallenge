# Berlin Clock API
## Usage
The API endpoint /berlinClock/{time} accepts a time input and returns the Berlin Clock time.

### Request
#### Method: GET
#### URL: /berlinClock/{time}
Replace {time} with the time you want to convert to Berlin Clock format, in the format hh:mm:ss.

#### Response
The response will be a JSON object representing the Berlin Clock time.

Example
Request
bash
Copy code
```
GET /berlinClock/13:17:01
```
#### Response
```
{
    "seconds": "O",
    "fiveHourLamps": "RRRO",
    "oneHourLamps": "RRRO",
    "fiveMinuteLamps": "YYROOOOOOOO",
    "oneMinuteLamps": "YYOO"
}

```

