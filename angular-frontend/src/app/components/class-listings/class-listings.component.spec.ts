import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ClassListingsComponent } from './class-listings.component';

describe('ClassListingsComponent', () => {
  let component: ClassListingsComponent;
  let fixture: ComponentFixture<ClassListingsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ClassListingsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ClassListingsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
