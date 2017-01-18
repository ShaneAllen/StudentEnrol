package com.enrol

class BootStrap {

    def init = { servletContext ->
	def module = new Module(
	title: 'System Architecture',
	code: '33333333',
	credits: 20,
	lecturer: 'Dr Shane',
	description: '''Hello''',
	course: 'System'
	).save()
	def lecturer = new Lecturer(
	fullName: 'DR SHANE ALLEN',
	post: 'HEAD LECTURER',
	subject: 'COMPUTING',
	lecturerEmail: 'SHANE.ALLEN@SHU.COM',
	office: 'CANTOR2003',
	bio: '''TOP'''
	).save()
    }
    def destroy = {
    }
}
