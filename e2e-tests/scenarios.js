'use strict';

/* https://github.com/angular/protractor/blob/master/docs/toc.md */

describe('my app', function() {


  it('should automatically redirect to /Reports when location hash/fragment is empty', function() {
    browser.get('index.html');
    expect(browser.getLocationAbsUrl()).toMatch("/Reports");
  });


  describe('Reports', function() {

    beforeEach(function() {
      browser.get('index.html#!/Reports');
    });


    it('should render Reports when user navigates to /Reports', function() {
      expect(element.all(by.css('[ng-view] p')).first().getText()).
        toMatch(/partial for view 1/);
    });

  });


  describe('Employee', function() {

    beforeEach(function() {
      browser.get('index.html#!/Employee');
    });


    it('should render Employee when user navigates to /Employee', function() {
      expect(element.all(by.css('[ng-view] p')).first().getText()).
        toMatch(/partial for view 2/);
    });

  });
});
