import groovy.json.JsonSlurper

def jsonSlurper = new JsonSlurper()

def config = jsonSlurper.parse(new File('/Users/saiashish/Desktop/sai/projects/service-integration-test-cases/tags/jenkinsTags_TST.json'))

return config['tags']
