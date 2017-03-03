import { Action } from './action';

export default (state = {
  open: false,
}, action) => {
  console.log(action);
  switch (action.type) {
    case Action.TOGGLE_MENU:
      return Object.assign({}, state, {
        open: !state.open,
      });

    default:
      return state;
  }
}
