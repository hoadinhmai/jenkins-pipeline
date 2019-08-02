pipelineJob('hdm-declarative-pipeline') {

  def repo = 'git://github.com/hoadinhmai/jenkins-pipeline.git'

  description("Pipeline for $repo")

  definition {
    cpsScm {
      scm {
        git {
          remote { url(repo) }
          branches('master', '**/feature*')
          scriptPath('jobs/declarativePipeline/Jenkinsfile')
      }
    }
  }
}
} 