kind: pipeline
name: default


workspace:
  path: /drone/src
  
steps:
- name: create-test
  image: poojamutadak/blazemeter:7.0
  environment:   
    apikey:
      from_secret: apiKey
    apisecret:
      from_secret: apiSecret
    testname: Drone Demo
    projectid: 881861
    createtest: true
    inputstartfile: BlazeDemoTest.jmx
    inputallfiles: /drone/src/Dependencies
    testurl: https://a.blazemeter.com/app/#/accounts/140171/workspaces/133647/projects/881861/tests/9225544
    Uploadfilechk: true
