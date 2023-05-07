import { Person } from './person';

describe('User', () => {
  it('should create an instance', () => {
    expect(new Person()).toBeTruthy();
  });
});
